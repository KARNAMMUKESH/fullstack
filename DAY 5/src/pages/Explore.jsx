import { Container, Header, Content,} from 'rsuite';
import {
  MDBRow,
  MDBCol,
  MDBBreadcrumb,
  MDBBreadcrumbItem,
} from 'mdb-react-ui-kit';
import SidenavigationBar from '../components/SidenavigationBar';
import NavigationBar from '../components/NavigationBar';
import ExploreCard from './ExploreCard';
const Explore = () => {
    return (
        <div className="show-fake-browser sidebar-page" style={{ background: "#F4F8FA",}}>
        <Container>
          <SidenavigationBar></SidenavigationBar>
          <Container>
            <Header>
              <NavigationBar></NavigationBar>
            </Header>
  
            <Content>
            <MDBRow>
          <MDBCol>
            <MDBBreadcrumb className="bg-white rounded-2 p-3 mb-4">
              <MDBBreadcrumbItem>
                <a>Home</a>
              </MDBBreadcrumbItem>
              <MDBBreadcrumbItem active>
                Explore
              </MDBBreadcrumbItem>
            </MDBBreadcrumb>
          </MDBCol>
        </MDBRow> 
              <ExploreCard/>
              <ExploreCard/>
            </Content>
          </Container>
        </Container>
      </div>
    );
};

export default Explore;