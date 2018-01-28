package com.danielasfregola.twitter4s.http.clients.streaming

object FS2 {
  implicit class StreamingClientFS2(streamingClient: StreamingClient) {

    // def processStreamFS2[T <: StreamingMessage : Manifest]
    //   (fs2Sink: fs2.Sink[IO, T]): Future[TwitterStream] = {
    //   implicit val system = ActorSystem(s"twitter4s-streaming-${UUID.randomUUID}")
    //   implicit val materializer = ActorMaterializer()
    //   implicit val ec = materializer.executionContext
    //   for {
    //     requestWithAuth <- withOAuthHeader(None)(materializer)(request)
    //     killSwitch <- FS2.processOrFailStreamRequest(requestWithAuth)(fs2Sink)
    //   } yield TwitterStream(consumerToken, accessToken)(killSwitch, requestWithAuth, system)
    // }

    def processStream: Unit = println("process stream")

  }
}
