import React, {Component} from 'react';
import { connect } from 'react-redux';
import * as actions from '../actions'

const mapStateToProps = (state) => ({
    message: state.hello.message
})

class RootPage extends Component {

    constructor(props){
        super(props);
        
    }

    componentWillMount(){
        this.props.sayHi();
    }

    render() {
        return (
            <div style={{width: '100%', height: '100%'}}>
                <div>{this.props.message}</div>
            </div>
        )
    }

}


export default connect(mapStateToProps, actions)(RootPage)