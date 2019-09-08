import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { ListComponent } from './forum/list/list.component';
import { EditComponent } from './forum/edit/edit.component';
import { ReadComponent } from './forum/read/read.component';


@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    ListComponent,
    EditComponent,
    ReactiveFormsModule,
    ReadComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
