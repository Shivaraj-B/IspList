import { Component, OnInit } from '@angular/core';
import { IspServiceService } from '../isp-service.service';
import { Isp } from '../isp';
import { Headers,Response} from '@angular/http';


@Component({
  selector: 'app-isp-list',
  templateUrl: './isp-list.component.html',
  styleUrls: ['./isp-list.component.css'],
  providers:[IspServiceService]
})
export class IspListComponent implements OnInit {

  cols:any[];
  isps:Isp[]=[];

constructor(private ispService :IspServiceService) { }

  ngOnInit() {

    this.ispService.getIsps().then(isps=> this.isps = isps);
    
    this.cols = [
      { field: 'name', header: 'Name' },
      { field: 'lowestPrice', header: 'Lowest Price' }
   
  ];
  
  }

}
