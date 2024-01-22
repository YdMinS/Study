import { Component, OnInit, Input, ViewEncapsulation, OnChanges, SimpleChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewChecked, AfterViewInit, OnDestroy, ViewChild, ElementRef, ContentChild } from '@angular/core';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrl: './server-element.component.css',
  encapsulation: ViewEncapsulation.None
})
export class ServerElementComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewChecked, AfterViewInit, OnDestroy{
  @Input('srvElement') element: {type: string, name: string, content: string};
  @Input() name: string;
  @ViewChild('heading', {static: true}) header: ElementRef;
  @ContentChild('contentParagraph', {static: true}) paragraph : ElementRef;

  constructor() {
    console.log('constructor called!');
  }

  ngOnInit(): void {
    console.log('ngOnInit called!');
    console.log('Text Content : '+this.header.nativeElement.textContent);
    console.log('Text Content of paragraph : '+ this.paragraph.nativeElement.textContent);  
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngChanges called');
    console.log(changes);
  }

  ngDoCheck(): void {
    console.log('ngDoCheck called');
  }

  ngAfterContentInit(): void {
    console.log('ngAfterContentInit called');
  }

  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked called');
  }

  ngAfterViewChecked(): void {
    console.log('ngAfterViewCheckec called');
  }

  ngAfterViewInit(): void {
    console.log('ngAfterViewInit called');
  }

  ngOnDestroy(): void {
    console.log('ngOnDestroy called');
  }
}
