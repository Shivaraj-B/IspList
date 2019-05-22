import { TestBed, inject } from '@angular/core/testing';

import { IspServiceService } from './isp-service.service';

describe('IspServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [IspServiceService]
    });
  });

  it('should be created', inject([IspServiceService], (service: IspServiceService) => {
    expect(service).toBeTruthy();
  }));
});
