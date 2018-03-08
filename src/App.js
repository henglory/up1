import React, { Component } from 'react';
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import RootReducer from './RootReducer'
import RootPage from './pages/RootPage'
import thunk from 'redux-thunk'
import { sayHi2 } from './actions'

const mainStore = createStore(
  RootReducer,
  applyMiddleware(
    thunk
  )
)

class App extends Component {

  state = {
    message: ""
  }

  constructor(props){
    super(props)
    sayHi2(this.setResult)
  }

  componentWillMount(){
  }

  setResult = (msg) => {
    this.setState({
      message: msg
    })
  }

  render() {
    return (
      //<Provider id="provider" store={mainStore}>
        <RootPage message={this.state.message}/>      
      //</Provider>
    );
  }
}

export default App;
