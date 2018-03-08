import axios from 'axios'
import ApiConstant from '../constants/ApiConstant'

const withHeader = () => {
    return {
        headers: {}
    }
}

export function sayHi(){

    return function(dispatch){

        axios.get(ApiConstant.HELLO_ENDPOINT, withHeader()).then(response => {
            dispatch({
                type: "load_complete",
                payload: response.data.message
            })

        }).catch( reason => {
            dispatch({
                type: "load_complete",
                payload: "Sorry, cannot connect backend"
            })
        })

    }

}

export function sayHi2(callback){
    axios.get(ApiConstant.HELLO_ENDPOINT, withHeader()).then(response => {
        callback(response.data.message)
    }).catch( reason => {
        callback("Sorry, cannot connect backend")
    })

}