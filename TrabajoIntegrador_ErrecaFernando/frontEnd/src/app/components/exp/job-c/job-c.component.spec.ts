import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobCComponent } from './job-c.component';

describe('JobCComponent', () => {
  let component: JobCComponent;
  let fixture: ComponentFixture<JobCComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JobCComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
