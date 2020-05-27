import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Dashboard from "./components/Dashboard";


/*const user = {
    firtName: 'raul',
    lastName: 'Palacios',
    avatar: logo
}
function getName(user) {
    return `${user.firtName} ${user.lastName}`
}

/*function getGreeting(user) {
    if(user){
        return <h1>Hello{getName(user)}</h1>
    }
    return <h1>Hello stranger</h1>
}
const element =
    <div>
        <h1>{getGreeting(user)}</h1>
        <img src={user.avatar} alt="logo"/>
    </div>*/


const container = document.getElementById('root')

ReactDOM.render(<Dashboard></Dashboard>, container)
