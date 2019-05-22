import { Component, OnInit } from '@angular/core';
import { IspServiceService } from '../isp-service.service';
import { Isp } from '../isp';
import { Headers,Response} from '@angular/http';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-isp-info',
  templateUrl: './isp-info.component.html',
  styleUrls: ['./isp-info.component.css'],
  providers:[IspServiceService]
})
export class IspInfoComponent implements OnInit {

  private sub: any;
  isp:Isp;
  name:string;

constructor(private ispService :IspServiceService,private route: ActivatedRoute) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.name = params['name'];
    
      this.ispService.getIspInfo(this.name).then(isp=> this.isp = isp); });

  }

    


}
