import { set } from "date-fns";
import { UploadDataCompletedEventArgsDescriptionMetadata } from "igniteui-angular-core";

export class Post
{
    userId:number;
    id:number;
    title:string;
    body:string

   
    constructor(userId: number, id: number, title: string, body: string) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
      }

}




