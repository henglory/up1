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

            console.log('get '+response.data.message)
            dispatch({
                type: "load_complete",
                payload: response.data
            })

        })

    }

}