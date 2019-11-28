import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  
  get addmovie(){
    return this.form.get('addmovie');
  }

  get movietitle(){
    return this.form.get('movietitle');
  }

  get movieimgurl(){
    return this.form.get('movieimgurl');
  }

  get desc(){
    return this.form.get('desc');
  }

  form = new FormGroup({
    addmovie : new FormControl('',[Validators.required]),
    movietitle : new FormControl('',[Validators.required]),
    movieimgurl : new FormControl('',[Validators.required]),
    desc : new FormControl('',[Validators.required])



  });



  constructor() { }

  ngOnInit() {
  }
  login(form: NgForm){
    console.log(form);
    
  }


}
