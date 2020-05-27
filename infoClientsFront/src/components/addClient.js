import React, { Component } from "react";
import axios from 'axios'
import TextField from '@material-ui/core/TextField';
import Button from "@material-ui/core/Button";
import InputLabel from '@material-ui/core/InputLabel';
import FormControl from '@material-ui/core/FormControl';
import Select from '@material-ui/core/Select';
import '../components/style/card.css'
import MenuItem from '@material-ui/core/MenuItem';

export class AddClientForm extends Component{

    constructor(props) {
        super(props)
        this.state = {
            clientNit: '',
            fullName: '',
            phone: '',
            address:'',
            creditLimit:'',
            avalibleCredit:'',
            vistsPercentage:'',
            countrys: [],
            states:[],
            citys: []
        }
    }

    getState(id){
        axios.get('https://jsonplaceholder.typicode.com/posts'/{id})
            .then(response =>{
                this.setState({countrys:response.data})
            })
            .catch(error =>{
                console.error(error)
            })
    }

    getCity(id){
        axios.get('https://jsonplaceholder.typicode.com/posts'/{id})
            .then(response =>{
                this.setState({countrys:response.data})
            })
            .catch(error =>{
                console.error(error)
            })
    }

    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(response =>{
                this.setState({countrys:response.data})
            })
            .catch(error =>{
                console.error(error)
            })
    }

    changeHandler =(e) =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submitHandler = e =>{
        e.preventDefault()
        console.log(this.state)
        axios.post('localhost:9090/saveClients', this.state)
            .then(response =>{
                console.log(response)
            })
            .catch(error =>{
                console.error(error)
            })
    }
    handleChangeSelected = event => {
        this.setState({ selected: event.target.value, name: event.target.name});
    };
    renderOptions() {
        return this.state.countrys.map((dt, i) => {
            //console.log(dt);
            return (
                <MenuItem
                    label="Select a country"
                    value={dt.id}
                    key={i} name={dt.title}>{dt.title}</MenuItem>

            );
        });
    }

    renderOptionStates() {
        return this.state.states.map((dt, i) => {
            //console.log(dt);
            return (
                <MenuItem
                    label="Select a country"
                    value={dt.id}
                    key={i} name={dt.title}>{dt.title}</MenuItem>

            );
        });
    }

    renderOptionCitys() {
        return this.state.citys.map((dt, i) => {
            //console.log(dt);
            return (
                <MenuItem
                    label="Select a country"
                    value={dt.id}
                    key={i} name={dt.title}>{dt.title}</MenuItem>

            );
        });
    }


    render() {
        const { clientNit, fullName, phone, address, creditLimit, avaliableCredit, vistsPercentage} = this.state
        return(
            <div >
                <form onSubmit={this.submitHandler} >
                    <div>
                        <div className='margin'>
                            <TextField  fullWidth label="Nit" type="text" name="clientNit" value={clientNit} onChange={this.changeHandler}/>
                        </div>
                        <div  className='margin'>
                            <TextField fullWidth label="fullName" type="text" name="fullName" value={fullName} onChange={this.changeHandler}/>
                        </div>
                        <div  className='margin'>
                            <TextField fullWidth label="Phone" type="text" name="phone" value={phone} onChange={this.changeHandler}/>
                        </div>
                        <div  className='margin'>
                            <TextField fullWidth label="Address"  type="text" name="address" value={address} onChange={this.changeHandler}/>
                        </div>
                        <div  className='margin'>
                            <TextField fullWidth label="CreditLimit"  type="text" name="creditLimit" value={creditLimit} onChange={this.changeHandler}/>
                        </div>
                        <FormControl fullWidth className='margin'>
                            <InputLabel id="demo-simple-select-label">Countrys</InputLabel>
                                <Select className="width50" value={this.state.selected} onChange={this.handleChangeSelected}>
                                    {this.renderOptions()}
                                    {this.getState(this.state.selected)}
                                </Select>
                                <h3>Selected Country - {this.state.selected}</h3>
                        </FormControl>
                        <FormControl fullWidth className='margin'>
                            <InputLabel id="demo-simple-select-label">Countrys</InputLabel>
                            <Select className="width50" value={this.state.selected} onChange={this.handleChangeSelected}>
                                {this.renderOptionStates()}
                            </Select>
                            <h3>Selected State - {this.state.selected}</h3>
                        </FormControl>
                        <FormControl fullWidth className='margin'>
                            <InputLabel id="demo-simple-select-label">Countrys</InputLabel>
                            <Select className="width50" value={this.state.selected} onChange={this.handleChangeSelected}>
                                {this.renderOptionStates()}
                            </Select>
                            <h3>Selected Country - {this.state.selected}</h3>
                        </FormControl>
                        <div  className='margin'>
                            <TextField fullWidth label="AvaliableCredit"  type="text" name="avaliableCredit" value={avaliableCredit} onChange={this.changeHandler}/>
                        </div>
                        <div  className='margin'>
                            <TextField fullWidth label="VistsPercentage" type="text" name="vistsPercentage" value={vistsPercentage} onChange={this.changeHandler}/>
                        </div>
                    </div>
                    <br/>
                    <Button variant="contained" color="primary" type="submit">Submit</Button>
                </form>

            </div>
        )

    }

}

export default AddClientForm