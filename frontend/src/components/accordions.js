import React, {Component} from "react";
import { Accordion, ListGroup } from "react-bootstrap";

class Accordions extends Component{
    constructor(props){
        super(props);
        this.props.getAvailability();
    }
    render(){
        var list = [];
        var data = this.props.availability.length===0?null:this.props.availability;
        var _content = null;
        if(data){
            for(let i = 1;i<data.length;i++){
                list.push(<ListGroup.Item as="li" key={i}>{data[i]}</ListGroup.Item>);
            }
            _content =                                                  
                        <Accordion defaultActiveKey={0}>
                            <Accordion.Item eventKey="0">
                                {data[0]==='가능'?<Accordion.Header><h6 className="green">{data[0]}</h6></Accordion.Header>:<Accordion.Header><h6 className="red">{data[0]}</h6></Accordion.Header>}
                                <Accordion.Body>
                                    <ListGroup variant="flush" as="ul">
                                        {list}
                                    </ListGroup>
                                </Accordion.Body>
                            </Accordion.Item>
                        </Accordion>;

        }

        return(
            <div>
                {_content}
            </div>
        );

    }

}

export default Accordions;