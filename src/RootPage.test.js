import React from 'react'
import ReactDOM from 'react-dom'
import App from './App'
import {shallow, render} from 'enzyme'
import RootPage from './pages/RootPage'

test('connect to backend', () => {
    //console.log(App);
    const ap = shallow(<RootPage message="test" />)
    console.log(ap.find('#hello-message').text())
});

test('connect to backend app', () => {
    //console.log(App);
    const ap = shallow(<App />)
    console.log(ap.find('#hello-message'))
});
