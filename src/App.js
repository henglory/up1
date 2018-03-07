import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import RootReducer from './RootReducer'
import RootPage from './pages/RootPage'
import thunk from 'redux-thunk'

const mainStore = createStore(
  RootReducer,
  applyMiddleware(
    thunk
  )
)

class App extends Component {
  render() {
    return (
      <Provider store={mainStore}>
        <RootPage />      
      </Provider>
    );
  }
}

export default App;
