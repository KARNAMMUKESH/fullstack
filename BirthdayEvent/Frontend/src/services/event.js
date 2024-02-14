import instance from "./axios";

const api_uri = "http://localhost:8181";

export const addevent = () => instance.post(`${api_uri}/api/v1/auth/addevent`);