import React from 'react'
import logo from '../assets/images/logo.svg'
import '../components/style/card.css'
import { Button } from '@material-ui/core';

class Card extends React.Component{
    render() {
        return (
            <div>
                <div>
                    <img src={logo}/>
                </div>
                <div>
                    <h1>Tecnique Guides</h1>
                    <p>Learn amazin STreet wo</p>
                </div>
                {App}
            </div>
        )
    }
}



function App() {
    return <Button color="primary">Hello World</Button>;
}

export default Card