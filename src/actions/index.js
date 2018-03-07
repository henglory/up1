import axios from 'axios';

const withHeader = () => {
    return {
        headers: {}
    }
}

export function sayHi(){

    return function(dispatch){

        axios.get("http://www.mocky.io/v2/5a9f5fcd2e00002a0074d054", withHeader()).then(response => {

            console.log('get '+response.data.message)
            dispatch({
                type: "load_complete",
                payload: response.data
            })

        })

    }

}