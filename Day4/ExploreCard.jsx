import {
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBCardImage,
  MDBIcon,
} from "mdb-react-ui-kit";

function ExploreCard() {
  return (
    <MDBContainer fluid className="my-5">
      <MDBRow>
        <MDBCol md="10" lg="3" className="mb-4 mb-lg-0">
          <MDBCard>
            <div className="d-flex justify-content-between p-3">
              <p className="lead mb-0">BirthDay Party</p>
              <div
                className="bg-info rounded-circle d-flex align-items-center justify-content-center shadow-1-strong"
                style={{ width: "35px", height: "35px" }}
              >
                <p className="text-white mb-0 small">3d</p>
              </div>
            </div>
            <MDBCardImage
              src="src\images\event1.jpg"
              position="top"
              alt="Laptop"
            />
            <MDBCardBody>
              <div className="d-flex justify-content-between">
                <p className="small">
                  <a href="#!" className="text-muted">
                    College Grounds,GadhiPuram.
                  </a>
                </p>
              </div>

              <div className="d-flex justify-content-between mb-3">
                <h5 className="mb-0">Basti Stoplight</h5>
                <h5 className="text-dark mb-0">$999</h5>
              </div>

              <div className="d-flex justify-content-between mb-2">
                <p className="text-muted mb-0">
                  Max: <span className="fw-bold">6</span>
                </p>
                <div className="ms-auto text-warning">
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                </div>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol md="10" lg="3" className="mb-4 mb-lg-0">
          <MDBCard>
            <div className="d-flex justify-content-between p-3">
              <p className="lead mb-0">Family Party</p>
              <div
                className="bg-info rounded-circle d-flex align-items-center justify-content-center shadow-1-strong"
                style={{ width: "35px", height: "35px" }}
              >
                <p className="text-white mb-0 small">7d</p>
              </div>
            </div>
            <MDBCardImage
              src="src\images\event3.jpg"
              position="top"
              alt="Laptop"
            />
            <MDBCardBody>
              <div className="d-flex justify-content-between">
                <p className="small">
                  <a href="#!" className="text-muted">
                    Bangalore,Karnataka
                  </a>
                </p>
              </div>

              <div className="d-flex justify-content-between mb-3">
                <h5 className="mb-0">PartyPulse</h5>
                <h5 className="text-dark mb-0">$1099</h5>
              </div>

              <div className="d-flex justify-content-between mb-2">
                <p className="text-muted mb-0">
                  Max: <span className="fw-bold">3</span>
                </p>
                <div className="ms-auto text-warning">
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon far icon="star" />
                </div>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol md="10" lg="3" className="mb-4 mb-lg-0">
          <MDBCard>
            <div className="d-flex justify-content-between p-3">
              <p className="lead mb-0">OutDoor Party</p>
              <div
                className="bg-info rounded-circle d-flex align-items-center justify-content-center shadow-1-strong"
                style={{ width: "35px", height: "35px" }}
              >
                <p className="text-white mb-0 small">2d</p>
              </div>
            </div>
            <MDBCardImage
              src="src\images\event2.jpg"
              position="top"
              alt="Gaming Laptop"
            />
            <MDBCardBody>
              <div className="d-flex justify-content-between">
                <p className="small">
                  <a className="text-muted">
                   Chennai,TamilNadu 
                  </a>
                </p>
              </div>

              <div className="d-flex justify-content-between mb-3">
                <h5 className="mb-0">CelebrateHub</h5>
                <h5 className="text-dark mb-0">$1299</h5>
              </div>

              <div className="d-flex justify-content-between mb-2">
                <p className="text-muted mb-0">
                  Max: <span className="fw-bold">2</span>
                </p>
                <div className="ms-auto text-warning">
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star-half-alt" />
                </div>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol md="10" lg="3" className="mb-4 mb-lg-0">
          <MDBCard>
            <div className="d-flex justify-content-between p-3">
              <p className="lead mb-0">BirthDay Party</p>
              <div
                className="bg-info rounded-circle d-flex align-items-center justify-content-center shadow-1-strong"
                style={{ width: "35px", height: "35px" }}
              >
                <p className="text-white mb-0 small">3d</p>
              </div>
            </div>
            <MDBCardImage
              src="src\images\event1.jpg"
              position="top"
              alt="Laptop"
            />
            <MDBCardBody>
              <div className="d-flex justify-content-between">
                <p className="small">
                  <a href="#!" className="text-muted">
                    College Grounds,GadhiPuram.
                  </a>
                </p>
              </div>

              <div className="d-flex justify-content-between mb-3">
                <h5 className="mb-0">Basti Stoplight</h5>
                <h5 className="text-dark mb-0">$999</h5>
              </div>

              <div className="d-flex justify-content-between mb-2">
                <p className="text-muted mb-0">
                  Max: <span className="fw-bold">6</span>
                </p>
                <div className="ms-auto text-warning">
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                  <MDBIcon fas icon="star" />
                </div>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
  );
}

export default ExploreCard;