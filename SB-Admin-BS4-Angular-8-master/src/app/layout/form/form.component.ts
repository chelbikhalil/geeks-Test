import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import {SynonymeService} from '../../service/synonyme.service'
import { synonyme } from 'src/app/models/synonyme';
@Component({
    selector: 'app-form',
    templateUrl: './form.component.html',
    styleUrls: ['./form.component.scss'],
    animations: [routerTransition()]
})
export class FormComponent implements OnInit {
synonyme: any;

    constructor( ) {}

    ngOnInit() {

       
    }
}

