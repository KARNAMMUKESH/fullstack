import { useState,useRef } from "react";
import {Form,Button,Panel,IconButton,Stack,Divider,FlexboxGrid,Animation,InputGroup,} from "rsuite";
import GoogleIcon from "@rsuite/icons/legacy/Google";
import EyeIcon from "@rsuite/icons/legacy/Eye";
import EyeSlashIcon from "@rsuite/icons/legacy/EyeSlash";
import Snackbar from '@mui/material/Snackbar';
import Alert from '@mui/material/Alert';
import { Link,useNavigate } from "react-router-dom";
import { signIn } from '../services/auth';
const Login = () => {
  // Create a state for the placement of the animation
  const [placement, setPlacement] = useState("right");
  const [visible, setVisible] = useState(false);
  const navigate = useNavigate();
  const [open, setOpen] = useState(false);
  const emailRef = useRef("");
  const passwordRef = useRef("");
  const handleFormSubmit = () => {
    setOpen(true);
    const email = emailRef.current.value;
    const password = passwordRef.current.value;
    const form = {
        email: email,
        password: password
    }
    console.log(form);
    signIn(form).then((res) => sessionStorage.setItem('token', res.data.token)).catch((err) => console.log(err));
    navigate('/home');
    emailRef.current.value = "";
    passwordRef.current.value = "";
}
  const handleClose = (event, reason) => {
    if (reason === 'clickaway') {
      return;
    }

    setOpen(false);
  };

  return (
    <>
      <Animation.Slide in={true} placement={placement}>
      <FlexboxGrid
        justify="center"
        align="middle"
        style={{
            height: "100vh",
          }}
        
      >
        <FlexboxGrid.Item colspan={12} style={{ width: 530, height: 415 ,boxShadow: "0px 10px 10px  gray"}}>
          <img
            src="src\images\1137.jpg" // Replace this with the URL or path of the image you want to use
            alt="Sign in illustration"
            style={{ width: 530, height: 415 }}
          />
        </FlexboxGrid.Item>
        <FlexboxGrid.Item colspan={12} style={{ width: 375, height: 415 ,boxShadow: "0px 10px 10px  gray"}}>
          <Panel
           
            header={<h3>Sign In</h3>}
          >
            <p style={{ marginBottom: 10 }}>
              <span className="text-muted">New Here? </span> 
             <Link to='/SignUp'> <a onClick={() => {
                    setPlacement("right");}}>Create an Account</a></Link>
            </p>

            <Form fluid>
              <Form.Group>
                <Form.ControlLabel>
                  Username or email address
                </Form.ControlLabel>
                <Form.Control name="name" inputRef={emailRef}/>
              </Form.Group>
              <Form.Group>
              <Form.ControlLabel>Password</Form.ControlLabel>
                  <InputGroup inside style={{ width: "100%" }}>
                    <Form.Control
                      name="password"
                      type={visible ? "text" : "password"}
                      autoComplete="off"
                      inputRef={passwordRef}
                    />
                    <InputGroup.Button onClick={() => setVisible(!visible)}>
                      {visible ? <EyeIcon /> : <EyeSlashIcon />}
                    </InputGroup.Button>
                  </InputGroup>
              </Form.Group>
              <Form.Group>
                <Stack spacing={4} direction="column" divider={<Divider vertical />}>
                  <Button appearance="primary" style={{width: 200,height: 50,padding: 10,fontSize: 20,}} onClick={handleFormSubmit}>
                    Sign in
                  </Button>
                  <Stack spacing={6}>
                    <IconButton icon={<GoogleIcon />}appearance="ghost">
                      Google
                    </IconButton>
                  </Stack>
                </Stack>
              </Form.Group>
            </Form>
          </Panel>
        </FlexboxGrid.Item>
      </FlexboxGrid>
      </Animation.Slide>
      <Snackbar open={open} autoHideDuration={2000} onClose={handleClose}>
        <Alert
          onClose={handleClose}
          severity="success"
          variant="filled"
          sx={{ width: '100%' }}
        >
          Login Successfull!
        </Alert>
      </Snackbar>
    </>
  );
};

export default Login;
