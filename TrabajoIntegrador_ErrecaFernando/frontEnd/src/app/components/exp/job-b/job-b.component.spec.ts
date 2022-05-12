import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobBComponent } from './job-b.component';

describe('JobBComponent', () => {
  let component: JobBComponent;
  let fixture: ComponentFixture<JobBComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JobBComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
