import {
  MDBCard,
  MDBCardImage,
  MDBCardBody,
  MDBCardTitle,
  MDBCardText,
  MDBCardFooter,
  MDBRow,
  MDBCol,
  MDBBtn,
  MDBBreadcrumb,
  MDBBreadcrumbItem,
  MDBContainer
} from 'mdb-react-ui-kit';
import { Link } from 'react-router-dom';
export default function YourEventsCard() {
  return (
    <MDBContainer>
    <MDBRow>
          <MDBCol>
            <MDBBreadcrumb className="bg-white rounded-3 p-3 mb-4">
              <MDBBreadcrumbItem>
                <a>Home</a>
              </MDBBreadcrumbItem>
              <MDBBreadcrumbItem active>
                Your Events
              </MDBBreadcrumbItem>
            </MDBBreadcrumb>
          </MDBCol>
        </MDBRow> 
    <MDBRow className='row-cols-1 row-cols-md-4 g-4'>
      <MDBCol>
        <Link to='/Users'><MDBCard className='h-80'>
          <MDBCardImage
            src='src\images\event1.jpg'
            alt='...'
            position='top'
          />
          <MDBCardBody>
            <MDBCardTitle>Basti Stoplight</MDBCardTitle>
            <MDBCardText>
             College Grounds,GadhiPuram.
              <hr/>
              <MDBBtn>Edit</MDBBtn>
              <MDBBtn outline className="ms-1">Delete</MDBBtn>
            </MDBCardText>
          </MDBCardBody>
          <MDBCardFooter>
            <small className='text-muted'>Last updated 3 mins ago</small>
          </MDBCardFooter>
        </MDBCard></Link>
      </MDBCol>
      <MDBCol>
        <MDBCard className='h-80'>
          <MDBCardImage
            src='src\images\event2.jpg'
            alt='...'
            position='top'
          />
          <MDBCardBody>
            <MDBCardTitle>PartyPulse</MDBCardTitle>
            <MDBCardText>
            Bangalore,Karnataka
              <hr/>
              <MDBBtn>Edit</MDBBtn>
              <MDBBtn outline className="ms-1">Delete</MDBBtn>
            </MDBCardText>
          </MDBCardBody>
          <MDBCardFooter>
            <small className='text-muted'>Last updated 3 mins ago</small>
          </MDBCardFooter>
        </MDBCard>
      </MDBCol>
      <MDBCol>
        <MDBCard className='h-80'>
          <MDBCardImage
            src='src\images\event3.jpg'
            alt='...'
            position='top'
          />
          <MDBCardBody>
            <MDBCardTitle>CelebrateHub</MDBCardTitle>
            <MDBCardText>
             Chennai,TamilNadu 
              <hr/>
              <MDBBtn>Edit</MDBBtn>
              <MDBBtn outline className="ms-1">Delete</MDBBtn>
            </MDBCardText>
          </MDBCardBody>
          <MDBCardFooter>
            <small className='text-muted'>Last updated 3 mins ago</small>
          </MDBCardFooter>
        </MDBCard>
      </MDBCol>
    </MDBRow>
    </MDBContainer>
  );
}