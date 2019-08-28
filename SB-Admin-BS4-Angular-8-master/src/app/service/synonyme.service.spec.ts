import { TestBed } from '@angular/core/testing';

import { SynonymeService } from './synonyme.service';

describe('SynonymeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SynonymeService = TestBed.get(SynonymeService);
    expect(service).toBeTruthy();
  });
});
