import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http';
import { AppComponent } from './app.component';
import { IspListComponent } from './isp-list/isp-list.component';
import { IspServiceService } from './isp-service.service';
import { TableModule } from 'primeng/table';
import {CardModule} from 'primeng/card';
import { IspInfoComponent } from './isp-info/isp-info.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    IspListComponent,
    IspInfoComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,    
    AppRoutingModule,
    TableModule,
    CardModule
  ],
  providers: [IspServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
