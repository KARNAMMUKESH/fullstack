
import {
  Form,
  RadioGroup,
  Radio,
  DatePicker,
  InputNumber,
  Rate,
  Uploader,
  Divider,
  ButtonToolbar,
  Button,
  SelectPicker,
  Container,
  Header,
  Content
} from 'rsuite';
import NavigationBar from '../components/NavigationBar';
import AdminSidenavigationBar from '../components/AdminSidenavigationBar';
import { useRef ,useState} from 'react';
import axios from 'axios';

const data = ['Kids','Adults','Men'].map(
    item => ({ label: item, value: item })
  );
const BasicForm = () => {
  const [selectedDate, setSelectedDate] = useState(null);
  const [selectedMax, setSelectedMax] = useState(0);
  const eventnameRef = useRef('');
  const eventdestinationRef = useRef('');
  // const dateRef = useRef(null);
  const organizerRef = useRef('');
  const imageurlRef = useRef('');
  const priceRef = useRef('');
  const handleFormSubmit = () => {
    const form = {
      eventname: eventnameRef.current.value,
      eventdestination: eventdestinationRef.current.value,
      date: selectedDate.toISOString(),
      organizer: organizerRef.current.value || '',
      maxparticipants: selectedMax || 0,
      price: priceRef.current.value,
      imageurl:imageurlRef.current.value || '',
    };
  
    console.log(form);
  
    const token = sessionStorage.getItem('token');
    const headers = {
      'Authorization': `Bearer ${token}`
    };
  
    axios
      .post('http://localhost:8181/api/v1/auth/addevent', form, { headers })
      .then((res) => {
        console.log(res.data);
        alert('Event added successfully');
      })
      .catch((error) => {
        console.error('Error adding event:', error);
        alert('Failed to add event');
      });
  };
  return (
    <div className="show-fake-browser sidebar-page" style={{ background: "#F4F8FA"}}>
        <Container>
          <AdminSidenavigationBar></AdminSidenavigationBar>
          <Container>
          <Header>
              <NavigationBar></NavigationBar>
            </Header>
  
            <Content>
      <Divider />
              <div style={{paddingLeft:'20%'}}>
      <div style={{background:'white', width:'80%'}}>
      <Form className="basic-form" layout="horizontal" style={{padding:'3vh'}}>
        <Form.Group controlId="Input">
          <Form.ControlLabel>Event Name</Form.ControlLabel>
          <Form.Control name="Input" inputRef={eventnameRef} />
        </Form.Group>
        <Form.Group controlId="InputNumber">
          <Form.ControlLabel>Maximum Participants</Form.ControlLabel>
          <Form.Control name="InputNumber" accepter={InputNumber} onChange={setSelectedMax}/>
        </Form.Group>

        <Form.Group controlId="Input">
          <Form.ControlLabel>Oranganizer</Form.ControlLabel>
          <Form.Control name="AutoComplete"  inputRef={organizerRef}/>
        </Form.Group>

        <Form.Group controlId="Input">
          <Form.ControlLabel>Destination</Form.ControlLabel>
          <Form.Control name="Destination" inputRef={eventdestinationRef}/>
        </Form.Group>

        <Form.Group controlId="radio">
          <Form.ControlLabel>Fees</Form.ControlLabel>
          <Form.Control name="radio" accepter={RadioGroup} inline style={{ marginLeft: -20 }}>
            <Radio value="Paid">Paid</Radio>
            <Radio value="Free">Free</Radio>
          </Form.Control>
        </Form.Group>
        <Form.Group controlId="Input">
          <Form.ControlLabel>Price</Form.ControlLabel>
          <Form.Control name="Price" inputRef={priceRef}/>
        </Form.Group>
        <Form.Group controlId="Input">
          <Form.ControlLabel>Card Url</Form.ControlLabel>
          <Form.Control name="Utl" inputRef={imageurlRef}/>
        </Form.Group>
        <Form.Group controlId="datePicker">
          <Form.ControlLabel>Date</Form.ControlLabel>
          <Form.Control name="datePicker" accepter={DatePicker} onChange={setSelectedDate} />
        </Form.Group>
        <Form.Group controlId="selectPicker">
          <Form.ControlLabel>SelectPicker</Form.ControlLabel>
          <Form.Control name="selectPicker"  searchable={false} accepter={SelectPicker} data={data} />
        </Form.Group>
        <Form.Group controlId="uploader">
        
          <Form.ControlLabel>Uploader</Form.ControlLabel>
          <Form.Control name="uploader" accepter={Uploader} action="#" />
        </Form.Group>
        <Form.Group controlId="rate">
          <Form.ControlLabel>Rate</Form.ControlLabel>
          <Form.Control name="rate" accepter={Rate} />
        </Form.Group>
        <Form.Group>
          <ButtonToolbar>
            <Button appearance="primary" onClick={handleFormSubmit}>Submit</Button>
            <Button appearance="default">Cancel</Button>
          </ButtonToolbar>
        </Form.Group>
      </Form>
      </div>
      </div>
      </Content>
          </Container>
        </Container>
    </div>
  );
};

export default BasicForm;