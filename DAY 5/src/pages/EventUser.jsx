import { DOMHelper, Table,Container,Header,Content ,Pagination} from 'rsuite';
import {
  MDBRow,
  MDBCol,
  MDBBreadcrumb,
  MDBBreadcrumbItem,
} from 'mdb-react-ui-kit';
import NavigationBar from '../components/NavigationBar';
import React from 'react';
import AdminSidenavigationBar from '../components/AdminSidenavigationBar';
const { Column, HeaderCell, Cell } = Table;
const { getHeight } = DOMHelper;

// Mock data
const generateMockData = () => {
  const data = [];
  for (let i = 0; i < 1000; i++) {
    data.push({
      id: i + 1,
      firstName: `First${i + 1}`,
      lastName: `Last${i + 1}`,
      gender: i % 2 === 0 ? 'Male' : 'Female',
      age: Math.floor(Math.random() * 50) + 20, // Random age between 20 and 70
      city: `City${i % 5 + 1}`,
      email: `email${i + 1}@example.com`,
    });
  }
  return data;
};

const data = generateMockData();

const VirtualizedTable = () => {
    const [activePage, setActivePage] = React.useState(1);
  return (
    <div style={{ background: "#F4F8FA",}}>
      <Container>
        <AdminSidenavigationBar></AdminSidenavigationBar>
        <Container>
          <Header>
            <NavigationBar></NavigationBar>
          </Header>
          <Content>
          <MDBRow>
          <MDBCol>
            <MDBBreadcrumb className="bg-white rounded-3 p-3 mb-4">
              <MDBBreadcrumbItem>
                <a>Home</a>
              </MDBBreadcrumbItem>
              <MDBBreadcrumbItem>
                Your Events
              </MDBBreadcrumbItem>
              <MDBBreadcrumbItem active>
                Users
              </MDBBreadcrumbItem>
            </MDBBreadcrumb>
          </MDBCol>
        </MDBRow> 
            <div style={{width:'80%',marginLeft:'5vh'}}> 
    <Table
      virtualized
      height={Math.max(getHeight(window) - 120, 400)}
      data={data}
      translate3d={false}
    >
      {/* Columns definition */}
      <Column width={70} align="center" fixed>
        <HeaderCell>Id</HeaderCell>
        <Cell dataKey="id" />
      </Column>

      <Column width={130}>
        <HeaderCell>First Name</HeaderCell>
        <Cell dataKey="firstName" />
      </Column>

      <Column width={130}>
        <HeaderCell>Last Name</HeaderCell>
        <Cell dataKey="lastName" />
      </Column>

      <Column width={100}>
        <HeaderCell>Gender</HeaderCell>
        <Cell dataKey="gender" />
      </Column>

      <Column width={100}>
        <HeaderCell>Age</HeaderCell>
        <Cell dataKey="age" />
      </Column>

      <Column width={200}>
        <HeaderCell>City</HeaderCell>
        <Cell dataKey="city" />
      </Column>

      <Column minWidth={200} flexGrow={1}>
        <HeaderCell>Email</HeaderCell>
        <Cell dataKey="email" />
      </Column>
    </Table>
    <hr/>
    <div style={{paddingLeft:'40%'}}>
    <Pagination total={100} limit={10} activePage={activePage} onChangePage={setActivePage}/>
    </div>
    </div> 
    </Content>
    </Container>
      </Container>
    </div>
  );
};

export default VirtualizedTable;
