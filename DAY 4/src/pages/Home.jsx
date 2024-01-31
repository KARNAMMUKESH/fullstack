import { Container, Header, Content,Carousel,Row,Col,Panel} from 'rsuite';
import SidenavigationBar from '../components/SidenavigationBar';
import NavigationBar from '../components/NavigationBar';
import "../css/homeStyle.css"
const Home = () => {
    return (
        <div className="show-fake-browser sidebar-page" style={{background:"#F4F8FA"}}>
        <Container>
            <SidenavigationBar></SidenavigationBar>
        <Container>
          <Header>
            <NavigationBar></NavigationBar>
          </Header>
          
          <Content>
          <hr/>
            <div style={{display:"flex",justifyContent:"center",alignItems:"center"}} >
              <div style={{display:"flex",justifyContent:"center",alignItems:"center",padding:"2vh",borderRadius:'2vh'}}>
            <Carousel  autoplay className="custom-slider" shape='bar' style={{width:"150vh",height:'60vh',}}>
              <img src="src\images\home2.jpg"/>
              <img src="src\images\home3.jpg" />
              <img src="src\images\home4.jpg" />
              <img src="src\images\home5.jpg" />
              <img src="src\images\home1.jpg"/>
            </Carousel>
              </div>
              </div>
              <div style={{display:"flex",justifyContent:"center",alignItems:"center",fontSize:"3vh",color:"black"}}>The Best of Party Events</div>
            <Row gutter={10} className="dashboard-header" style={{padding:'1vh'}}>
        <Col xs={7}>
          <Panel className="trend-box" style={{background: "linear-gradient(to bottom, #FF243F, #FF501D)",height:"15%",width:"97%"}}>
            <img className="chart-img" src='src\images\party1.png'/>
            <div className="title">Birthday Parties</div>
            <div className="title">& Events</div>
            <div className="value">100+</div>
          </Panel>
        </Col>
        <Col xs={7}>
          <Panel className="trend-box" style={{background: "linear-gradient(to left, #00CDF1, #0075EE)",height:"15%",width:"97%"}}>
            <img className="chart-img" src='src\images\party2.png'/>
            <div className="title">Suprise Parties</div>
            <div className="title">& Gifts</div>
            <div className="value">350+</div>
          </Panel>
        </Col>
        <Col xs={7}>
          <Panel className="trend-box" style={{background: "linear-gradient(to right, #00D194, #00D1CD)",height:"15%",width:"97%"}}>
            <img className="chart-img" src='src\images\party3.png'/>
            <div className="title">Various</div>
            <div className="title">Categories</div>
            <div className="value">10+</div>
          </Panel>
        </Col>
        <Col xs={7}>
          <Panel className="trend-box" style={{background: "linear-gradient(to bottom, #D20063, #FA539A)",height:"15%",width:"97%"}}>
            <img className="chart-img" src='src\images\party4.png'/>
            <div className="title">Comedy And</div>
            <div className="title">Music Shows</div>
            <div className="value">40+</div>
          </Panel>
        </Col>
      </Row>
      
          </Content>
        </Container>
      </Container>
    </div>
        
    );
};

export default Home;