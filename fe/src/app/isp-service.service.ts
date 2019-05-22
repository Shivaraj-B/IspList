import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions,ResponseContentType} from '@angular/http';
import { Isp } from './isp';
import { Observable } from 'rxjs/Observable';
import { AbstractService } from './abstract.service';

@Injectable()
export class IspServiceService extends AbstractService{

  constructor(public http:Http) { 
      super(http);
  }

  name:string;
  
  getIsps()
  {
    return this.http.get(this.baseUrl+"/ispdetails", this.appendHeaders())
    .toPromise()
    .then(this.extractData)
    .catch(this.errorHandler);
  }

  getIspInfo(name:string)
  {
    this.name = name;
    return this.http.get(this.baseUrl+"/ispdetails/"+this.name, this.appendHeaders())
    .toPromise()
    .then(this.extractData)
    .catch(this.errorHandler);
  }

}
