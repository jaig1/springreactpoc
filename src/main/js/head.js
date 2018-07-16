import React, { Component } from 'react';

class Head extends Component {
	
	constructor(props) {
      super(props);
      this.state = {name : "Mickey Mouse"};
      
   }
	
  render() {
    return (
      <div>
        <header>
          <h1>Getting Data Provided by Spring...{this.state.name}</h1>
        </header>
      </div>
    );
  }
 
componentWillMount() {
	  this.state = window.getdata();
	} 

}

export default Head;
