import { NgModule } from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import { IspInfoComponent } from './isp-info/isp-info.component';
import { IspListComponent } from './isp-list/isp-list.component';

const  routes : Routes =[
  {
    path:'isps',
    component:IspListComponent
  },
  {
    path: 'isps/:name',
    component: IspInfoComponent
  }
];
@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports:[RouterModule]

})
export class AppRoutingModule { }
