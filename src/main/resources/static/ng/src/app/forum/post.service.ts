import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from './post';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  postsUrl = 'assets/posts.json';
  postUrl = 'assets/post.json';

  constructor(private http: HttpClient) {
  }

  list():Observable<Post[]> {
    return this.http.get(this.postsUrl) as Observable<Post[]>;
  }

  get(id: number):Observable<Post> {
    return this.http.get(this.postUrl) as Observable<Post>;
  }

  post(post:Post) {
    this.http.post(this.postUrl,post);
  }


}
