import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions,ResponseContentType} from '@angular/http';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class AbstractService {

  public baseUrl = 'http://localhost:8088';

  constructor(public http:Http) { }

  // Helper methods

  public extractData(res:Response)
  {
    console.log("response is ");
    let body = res.json();//extract the body of json response
    return body||{};
  }

  public errorHandler(error:Response|any)
  {
    let errorMsg:string;

    if(error instanceof Response)
    {
      const body = error.json()|| '';//extract the body of json response
      const err = body.error|| JSON.stringify(body);
      errorMsg = `${error.status} - ${error.statusText || ''} $err`;
    }
    else
    {
      errorMsg = error.message ? error.message: error.toString();
    }
    console.error(errorMsg);
    return Observable.throw(errorMsg);
  }

  private getHeader(): Headers{
    const headers : Headers = new Headers();
    headers.append('Content-Type', 'application/json');
    
    return headers;
  }

  public appendHeaders()
  {
    let reqOpt : RequestOptions = new RequestOptions(
      {
        headers: this.jsonHeaders()
      }
    );
    return reqOpt;
  }

  public jsonHeaders(): Headers{
    return this.getHeader();
  }

}
