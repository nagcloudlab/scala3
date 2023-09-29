// 1 - the necessary imports
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random
import Thread.sleep
import scala.util.Success
import scala.util.Failure

// Future with blocking-call

def futures1 =

  // 1: create a Future that runs in a separate thread and returns “eventually”
  val f = Future {
    // this could be any long-running algorithm
    sleep(Random.nextInt(2_000))
    1 + 1
  }

  // 2: this is blocking, i.e., pausing the current thread to wait for a
  // result from another thread
  val result = Await.result(f, 1.second)
  println(result)

  sleep(1_000)

//  Using Callback and Transformation Methods with Futures

//--------------------------------------------------------------------------------

// Solution 1: Use onComplete

def getMeaningOfLife() =
  sleep(Random.nextInt(500))
  42

def callbacks1 =
  println("starting calculation ...")
  val f = Future {
    getMeaningOfLife()
  }

  println("before onComplete")
  // f.onComplete {
  //   case Success(value) =>
  //     println(s"Got the callback, meaning =$value")
  //   case Failure(exception) => exception.printStackTrace()
  // }
  f.onComplete(
    _.fold(
      _.printStackTrace,
      value => println(s"Got the callback, meaning = $value")
    )
  )

  // do the rest of your work
  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)

  sleep(2_000)

// Solution 2: Use andThen or foreach

def callbacks2 =
  println("Creating the future")

  val future: Future[Int] = Future {
    // sleep for a random time before returning 42
    val sleepTime = Random.nextInt(500)
    sleep(sleepTime)
    println("Leaving the future")
    if sleepTime > 250 then throw new Exception("Ka-boom")
    42
  }
  // handle the result of f with andThen
  println("Before andThen")

  future andThen {
    case Success(x) =>
      val y = x * 2
      println(s"andThen: $y")
    case Failure(t) =>
      println(s"andThen: ${t.getMessage}")
  }

  println("Aftersleep(1_000")
  sleep(2_000)

def callbacks3 =
  val f: Future[Int] = Future {
    val sleepTime = Random.nextInt(500)
    sleep(sleepTime)
    if sleepTime > 250 then throw new Exception("Ka-boom")
    42
  }
  f.foreach(println)
  sleep(1_000)

//-----------------------------------------------------------
// Writing Methods That Return Futures
//-----------------------------------------------------------

def futuresFunction =

  // a function that returns a Future
  def longRunningComputation(i: Int): Future[Int] = Future {
    sleep(1000)
    i + 1
  }

  // this does not block
  longRunningComputation(11).onComplete {
    case Success(result) => println(s"result = $result")
    case Failure(e)      => e.printStackTrace
  }
  // keep the jvm from shutting down
  sleep(1_000)

//-----------------------------------------------------------
//  Running Multiple Futures in Parallel

//-----------------------------------------------------------

@main def multipleFutures1 =

  // (a) create the futures
  val f1 = Future { sleep(800); 1 }
  val f2 = Future { sleep(200); 2 }
  val f3 = Future { sleep(400); 3 }

  // (b) run them simultaneously in a for-comprehension
  val result = for
    r1 <- f1
    r2 <- f2
    r3 <- f3
  yield (r1 + r2 + r3)

  // (c) process the result
  result.onComplete {
    case Success(x) => println(s"result = $x")
    case Failure(e) => e.printStackTrace
  }
  // important for a little parallel demo: keep the jvm alive
  sleep(3_000)
