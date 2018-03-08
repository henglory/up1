

const INIT_STATE = {
    message: ""
}

const hello = (state = INIT_STATE, action) => {
    switch(action.type) {
        case 'load_complete' :
            return {
                ...state,
                message: action.payload
            }
        default : return state;
    }
}

export { hello };