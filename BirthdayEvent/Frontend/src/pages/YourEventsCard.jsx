import { useState, useEffect } from 'react';
import axios from 'axios';
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

const YourEventsCard = () => {
  const [events, setEvents] = useState([]);

  useEffect(() => {
    fetchEvents();
  }, []);

  const fetchEvents = () => {
    axios.get('http://localhost:8181/api/v1/auth/eventlist', {
      headers: {
        Authorization: `Bearer ${sessionStorage.getItem('token')}`
      }
    })
    .then((response) => {
      setEvents(response.data.data);
    })
    .catch((error) => {
      console.error('Error fetching event list:', error);
    });
  };

  const deleteEvent = (eventid) => {
    axios.delete('http://localhost:8181/api/v1/auth/deleteevent', {
      headers: {
        Authorization: `Bearer ${sessionStorage.getItem('token')}`,
        'Content-Type': 'application/json'
      },
      data: {
        eventid: eventid
      }
    })
    .then((response) => {
      console.log('Event deleted:', response.data.message);
      fetchEvents(); // Refresh the event list after deletion
    })
    .catch((error) => {
      console.error('Error deleting event:', error);
    });
  };

  return (
    <MDBContainer>
      <MDBRow>
        <MDBCol>
          <MDBBreadcrumb className="bg-white rounded-3 p-3 mb-4">
            <MDBBreadcrumbItem>
              <Link to="/">Home</Link>
            </MDBBreadcrumbItem>
            <MDBBreadcrumbItem active>
              Your Events
            </MDBBreadcrumbItem>
          </MDBBreadcrumb>
        </MDBCol>
      </MDBRow>
      <MDBRow className='row-cols-1 row-cols-md-4 g-4'>
        {events.map((event) => (
          <MDBCol key={event.eventid}>
            <MDBCard className='h-80'>
              <MDBCardImage
                src={event.imageurl}
                alt='Event Image'
                position='top'
              />
              <MDBCardBody>
                <MDBCardTitle>{event.eventname}</MDBCardTitle>
                <MDBCardText>
                  {event.eventdestination}
                  <hr/>
                  <MDBBtn>Edit</MDBBtn>
                  <MDBBtn outline className="ms-1" onClick={() => deleteEvent(event.eventid)}>Delete</MDBBtn>
                </MDBCardText>
              </MDBCardBody>
              <MDBCardFooter>
                <small className='text-muted'>Last updated 3 mins ago</small>
              </MDBCardFooter>
            </MDBCard>
          </MDBCol>
        ))}
      </MDBRow>
    </MDBContainer>
  );
};

export default YourEventsCard;
