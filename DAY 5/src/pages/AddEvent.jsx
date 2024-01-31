
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
  AutoComplete,
  SelectPicker,
  Container,
  Header,
  Content
} from 'rsuite';
import NavigationBar from '../components/NavigationBar';
import AdminSidenavigationBar from '../components/AdminSidenavigationBar';

const data = ['Kids','Adults','Men'].map(
    item => ({ label: item, value: item })
  );
const BasicForm = () => {
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
          <Form.Control name="Input" />
        </Form.Group>
        <Form.Group controlId="InputNumber">
          <Form.ControlLabel>Maximum Participants</Form.ControlLabel>
          <Form.Control name="InputNumber" accepter={InputNumber} />
        </Form.Group>

        <Form.Group controlId="AutoComplete">
          <Form.ControlLabel>Oranganizer</Form.ControlLabel>
          <Form.Control name="AutoComplete" accepter={AutoComplete}/>
        </Form.Group>

        <Form.Group controlId="Textarea">
          <Form.ControlLabel>Destination</Form.ControlLabel>
          <Form.Control name="Textarea"  rows={3} />
        </Form.Group>

        <Form.Group controlId="radio">
          <Form.ControlLabel>Fees</Form.ControlLabel>
          <Form.Control name="radio" accepter={RadioGroup} inline style={{ marginLeft: -20 }}>
            <Radio value="HTML">Paid</Radio>
            <Radio value="CSS">Free</Radio>
          </Form.Control>
        </Form.Group>

        <Form.Group controlId="datePicker">
          <Form.ControlLabel>Date</Form.ControlLabel>
          <Form.Control name="datePicker" accepter={DatePicker} />
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
            <Button appearance="primary">Submit</Button>
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