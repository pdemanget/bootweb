import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HelloComponent } from './hello/hello.component';
import { ListComponent } from './forum/list/list.component';
import { EditComponent } from './forum/edit/edit.component';


const routes: Routes = [
  { path: 'hello', component: HelloComponent },
  { path: 'posts/:tag',      component: ListComponent },
  { path: 'post/:id',      component: EditComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
