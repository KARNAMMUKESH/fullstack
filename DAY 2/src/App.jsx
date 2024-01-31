import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { lazy, Suspense } from 'react';
import Spinner from "./components/Spinner";
// const Lazyhome=lazy("./pages/home")
const LazyLogin=lazy(()=>import("./pages/Login"))
const LazySignUp=lazy(()=>import("./pages/SignUp"))
const LazyHome=lazy(()=>import("./pages/Home"))
const LazyExplore=lazy(()=>import("./pages/Explore"))
const LazyProfile=lazy(()=>import("./pages/Profilepage"))
const LazyGifts=lazy(()=>import("./pages/GiftsPage"))
const LazyAddEvent=lazy(()=>import("./pages/AddEvent"))
const LazyAdmin=lazy(()=>import("./pages/Admin/Admin"))
const LazyYourEvents=lazy(()=>import("./pages/YourEvent"))
const LazyEventList=lazy(()=>import("./pages/EventUser"))

function App() {
  const router = createBrowserRouter([  
    {
      path:'/',
      element:<Suspense fallback={<Spinner/>}><LazyLogin/></Suspense>
    },
    {
      path:'/Signup',
      element:<Suspense fallback={<Spinner/>}><LazySignUp/></Suspense>
    },
    {
      path:'/Home',
      element:<Suspense fallback={<Spinner/>}><LazyHome/></Suspense>
    },
    {
      path:'/Explore',
      element:<Suspense fallback={<Spinner/>}><LazyExplore/></Suspense>
    },
    {
      path:'/Profile',
      element:<Suspense fallback={<Spinner/>}><LazyProfile/></Suspense>
    },
    {
      path:'/Gifts',
      element:<Suspense fallback={<Spinner/>}><LazyGifts/></Suspense>
    },
    {
      path:'/AddEvent',
      element:<Suspense fallback={<Spinner/>}><LazyAddEvent/></Suspense>
    },
    {
      path:'/Admin',
      element:<Suspense fallback={<Spinner/>}><LazyAdmin/></Suspense>
    },
    {
      path:'/AdminEvents',
      element:<Suspense fallback={<Spinner/>}><LazyYourEvents/></Suspense>
    },
    {
      path:'/Users',
      element:<Suspense fallback={<Spinner/>}><LazyEventList/></Suspense>
    },
  ])

  return (
    <>
      <RouterProvider router={router}/>
    </>
  )
}

export default App