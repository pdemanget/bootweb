import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from '../post';
import { ActivatedRoute, Router } from '@angular/router';
import { PostService } from '../post.service';

@Component({
  selector: 'app-read',
  templateUrl: './read.component.html',
  styleUrls: ['./read.component.css']
})
export class ReadComponent implements OnInit {
  post: Observable<Post>;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: PostService
  ) {}

  ngOnInit() {
      let id = this.route.snapshot.paramMap.get('id');
      this.post = this.service.get( +id );
  }

}
