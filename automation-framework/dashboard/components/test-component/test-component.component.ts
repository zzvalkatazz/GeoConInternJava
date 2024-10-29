import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { InputTextComponent } from 'src/@components/input/text/input-text.component';
import { Post } from './models/module';
import { ClockComponent } from './components/clock/clock.component';

@Component({
  selector: 'geocon-test-component',
  standalone: true,
  imports: [InputTextComponent, ClockComponent],
  templateUrl: './test-component.component.html',
  styleUrl: './test-component.component.scss'
})
export class TestComponentComponent {
  /**
   *
   */
  public name = new FormControl(null,[Validators.required]);
 
  //public form = new FormGroup({name:this.name})

  
  
  public userId = new FormControl(null,[Validators.required]);
 
  public body = new FormControl(null,[Validators.required]);

  public id = new FormControl(null,[Validators.required]);

  public title = new FormControl(null,[Validators.required]);

  public timeControl = new FormControl(null);
 
  public form = new FormGroup({
    userId: this.userId,
    body: this.body,
    id: this.id,
    title: this.title,
    timeControl:this.timeControl
  });

  constructor(public http:HttpClient) {
    
    

  }
  public randomPost: Post|null=null;
  public clickFormButton()
  {
    this.http.get<Post[]>('https://jsonplaceholder.typicode.com/posts').subscribe((response: Post[]) => {
      const randomIndex = Math.floor(Math.random() * response.length);
      const randomPost: Post = response[randomIndex]; 

    
      this.userId.setValue(randomPost.userId);
      this.body.setValue(randomPost.body);
      this.id.setValue(randomPost.id);
      this.title.setValue(randomPost.title);

    
      this.randomPost = randomPost;

      console.log(this.randomPost);
    });
  }

 public createPost()
 {
  const post={
    title: this.userId.value,
    body:this.body.value,
    userId:this.userId.value, 
  };
    this.http.post('https://jsonplaceholder.typicode.com/posts', post).subscribe(response=>
    {
      console.log('Created post:',response);
    });
 }
}
