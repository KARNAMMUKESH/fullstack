// SignUp.jsx
import React, { useState } from "react";
import {
  Form,
  Button,
  Panel,
  InputGroup,
  Stack,
  Checkbox,
  Divider,
  FlexboxGrid,
  Animation,
} from "rsuite";
import EyeIcon from "@rsuite/icons/legacy/Eye";
import EyeSlashIcon from "@rsuite/icons/legacy/EyeSlash";
import { Link } from "react-router-dom";
const SignUp = () => {
  // Create a state for the current page
  // Create a state for the placement of the animation
  const [placement, setPlacement] = useState("right");
  const [visible, setVisible] = React.useState(false);
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
      <FlexboxGrid.Item colspan={12} style={{ width: 630, height: 620, boxShadow: "0px 10px 10px  gray" }}>
        <img
          src="src\images\1137.jpg" // Replace this with the URL or path of the image you want to use
          alt="Sign in illustration"
          style={{ width: 630, height: 620 }}
        />
      </FlexboxGrid.Item>
      <FlexboxGrid.Item colspan={12} style={{ width: 400, height: 620, boxShadow: "0px 10px 10px  gray" }}>
            <Panel header={<h3>Create an Account</h3>}>
              <p>
                <span>Already have an account?</span>
                <Link to='/'><a
                  onClick={() => {
                    setPlacement("right");
                  }}
                >
                  Sign in here
                </a></Link>
              </p>

              <Divider>OR</Divider>

              <Form fluid>
                <Form.Group>
                  <Form.ControlLabel>Username</Form.ControlLabel>
                  <Form.Control name="name" />
                </Form.Group>

                <Form.Group>
                  <Form.ControlLabel>Email</Form.ControlLabel>
                  <Form.Control name="email" />
                </Form.Group>
                <Form.Group>
                  <Form.ControlLabel>Password</Form.ControlLabel>
                  <InputGroup inside style={{ width: "100%" }}>
                    <Form.Control
                      name="password"
                      type={visible ? "text" : "password"}
                      autoComplete="off"
                    />
                    <InputGroup.Button onClick={() => setVisible(!visible)}>
                      {visible ? <EyeIcon /> : <EyeSlashIcon />}
                    </InputGroup.Button>
                  </InputGroup>
                </Form.Group>

                <Form.Group>
                  <Form.ControlLabel>Confirm Password</Form.ControlLabel>
                  <Form.Control name="confirm-password" type="password" />
                </Form.Group>

                <Form.Group>
                  <Stack style={{ marginLeft: -10 }}>
                    <Checkbox>I Agree</Checkbox>
                    <Button appearance="link">Terms and conditions.</Button>
                  </Stack>
                </Form.Group>

                <Form.Group>
                  <Stack spacing={4}>
                    <Button
                      appearance="primary"
                      style={{
                        width: 170,
                        height: 40,
                        padding: 5,
                        fontSize: 20,
                        marginLeft: "10vh",
                        marginBottom:'2vh'
                      }}
                    >
                      Submit
                    </Button>
                  </Stack>
                </Form.Group>
              </Form>
            </Panel>
      </FlexboxGrid.Item>
    </FlexboxGrid>
    </Animation.Slide>
    </>
  );
};

export default SignUp;
