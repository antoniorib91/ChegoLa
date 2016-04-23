<%@page import="br.feevale.controle.ControleLogin"%>
<%
	String nome = request.getParameter( "nome" );
    String senha = request.getParameter( "senha" );
    String msg = null;
    
    if( nome != null && senha != null ) {
    	ControleLogin cl = new ControleLogin( nome, senha );
    	
    	if( cl.isUsuarioOk() ) {
    		session.setAttribute( "UsuarioLogado", cl );
    		response.sendRedirect( "./Pagina_usuário.jsp" );
    		return;
    	} else {
    		msg = "Nome ou senha inválidos";
    		session.removeAttribute( "UsuarioLogado" );
    	}
    }
%>



<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>Pagina Inicial</title>
      <!-- Bootstrap Core CSS -->
      <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
      <!-- Custom Fonts -->
      <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
      <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
      <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">
      <!-- Plugin CSS -->
      <link rel="stylesheet" href="css/animate.min.css" type="text/css">
      <!-- Custom CSS -->
      <link rel="stylesheet" href="css/creative.css" type="text/css">
      <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
      <link href= "meus_efeitos/css/Meucss.css" rel="stylesheet">
      <script type="meus_efeitos/js/meus_efeitos.js" charset="UTF-8"></script>
      <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
   </head>
   <body id="page-top">
      <div class="container">
         <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
               <!-- Brand and toggle get grouped for better mobile display -->
               <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand page-scroll" href="#page-top">ChegoLá </a>
               </div>
               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                  <ul class="nav navbar-nav navbar-right">
                     <li>
                        <a class="page-scroll" href="#about">Cadastre-se</a>
                     </li>
                     <li>
                        <a class="page-scroll" href="#services">Serviços</a>
                     </li>
                     <li>
                        <a class="page-scroll" href="#" data-toggle="modal" data-target="#exampleModal" >Entrar</a>
                     </li>
                  </ul>
               </div>
            </div>
            <!-- /.navbar-collapse -->
      </div>
      <!-- /.container-fluid -->
      <!-- AQUI COMEÃ‡A A PÃGINA DE LOGIN -->
      <div class="row">
      <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
      <div class="modal-dialog" role="document">
      <div class="modal-content">
      <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      <h4>Realizar Login</h4>
      </div>
      
      
      <div class="modal-body">
           <form class="form-signin" method="post">
	      <div class="form-group">
		      <label for="recipient-name" name="nome" class="control-label">E-mail:</label>
		      <input type="text" name="nome" class="form-control" placeholder="login"id="recipient-name">  
	      </div>
	         
	      <div class="form-group">
		      <label for="recipient-name" class="control-label">Senha:</label>
		      <input type="password" name="senha" class="form-control" placeholder="senha">  
	      </div>
	      
	             <%	if( msg != null ) { %>
				<div class="alert alert-danger" role="alert">
				  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
				  <span class="sr-only">Error:</span>
				  Login ou senha inválido
				</div>		
				
			  <%  } %>
      
      <div class="modal-footer">
      <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
      <button type="submit" class="btn btn-primary" value="Login">Entrar</button>
  
     
       </form>
             </div>
       
      </div>
      </div>
      </div>
      </div>
      </div>
      <!-- AQUI TERMINA A PÃGINA DE LOGIN -->
      </nav>
      <header>
         <div class="header-content">
            <div class="header-content-inner">
               <video id="video" class="video" muted loop>
                  <source src="https://www.html5dev.com.br/blog/wp-content/uploads/2015/05/bridge_timelapse_271.webm" type="video/webm"/>
                  <!-- <source src="https://www.html5dev.com.br/blog/wp-content/uploads/2015/05/bridge_timelapse_271.mp4" type="video/mp4"/>
                     <source src="https://www.html5dev.com.br/blog/wp-content/uploads/2015/05/bridge_timelapse_271.ogv" type="video/ogg"/>
                     -->
               </video>
               <h2 style="font-size: 50px; font-family:Helvetica">
               A Melhor empresa em viagens Aéreas e Translados</h>
               <hr>
               <div class="container">
                  <div class="row">
                     <div class="col-xs-9">
                        <form class="form-horizontal">
                           <div class="form-group form-group-lg">
                              <div class="col-sm-10" >
                                 <input  style="margin-left: 130px"; class="form-control" type="text" id="formGroupInputLarge" placeholder="Pesquisar um local ">
                              </div>
                           </div>
                        </form>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </header>
      <section class="bg-primary" id="about">
         <div class="container">
            <div class="row">
               <div class="col-lg-8 col-lg-offset-2 text-center">
                  <h2 class="section-heading">Nós temos o que você precisa!</h2>
                  <hr class="light">
                  <p class="text-faded">OS melhores serviços de translado e passagens aéreas!</p>
                  <a href="#" class="btn btn-default btn-xl">Conhecer!</a>
               </div>
            </div>
         </div>
      </section>
      <section id="services">
         <div class="container">
            <div class="row">
               <div class="col-lg-12 text-center">
                  <h2 class="section-heading">Conheça os serviços</h2>
                  <hr class="primary">
               </div>
            </div>
         </div>
         <div class="container">
            <div class="row">
               <div class="col-lg-3 col-md-6 text-center">
                  <div class="service-box">
                     <i class="fa fa-4x fa-diamond wow bounceIn text-primary"></i>
                     <h3>Empresas Gold</h3>
                     <p class="text-muted">Empresa conceituada no mercado.</p>
                  </div>
               </div>
               <div class="col-lg-3 col-md-6 text-center">
                  <div class="service-box">
                     <i class="fa fa-4x fa-paper-plane wow bounceIn text-primary" data-wow-delay=".1s"></i>
                     <h3>Pronto para Voar</h3>
                     <p class="text-muted">PAssagens aéreas com melhor preço!</p>
                  </div>
               </div>
               <div class="col-lg-3 col-md-6 text-center">
                  <div class="service-box">
                     <i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s"></i>
                     <h3>Cadastro</h3>
                     <p class="text-muted">Cadastro rápido e sem burocracia</p>
                  </div>
               </div>
               <div class="col-lg-3 col-md-6 text-center">
                  <div class="service-box">
                     <i class=" fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s"></i>
                     <h3>Viagem com a Familia</h3>
                     <p class="text-muted"></p>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <section class="no-padding" id="portfolio">
         <div class="container-fluid">
            <div class="row no-gutter">
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/1.1.jpg" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Turismo	
                           </div>
                           <div class="project-name">
                              Cachoeiras
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/2.2.jpg" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Turismo
                           </div>
                           <div class="project-name">
                             Praias
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/3.3.jpg" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Internacional
                           </div>
                           <div class="project-name">
	                         Paris
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/4.4.jpg" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Turismo
                           </div>
                           <div class="project-name">
                              Rio de Janeiro
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/5.5.jpg" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Trabalho
                           </div>
                           <div class="project-name">
                             São Paulo	
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <a href="#" class="portfolio-box">
                     <img src="img/portfolio/6.6.png" class="img-responsive" alt="">
                     <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                           <div class="project-category text-faded">
                              Turismo
                           </div>
                           <div class="project-name">
                             Curitiba
                           </div>
                        </div>
                     </div>
                  </a>
               </div>
            </div>
         </div>
      </section>
      <section id="contact">
         <div class="container">
            <div class="row">
               <div class="col-lg-8 col-lg-offset-2 text-center">
                  <h2 class="section-heading">Partiu Viagem ;)</h2>
                  <hr class="primary">
                  <p>Entre em contato com nossos canais de comunicação!</p>
               </div>
               <div class="col-lg-4 col-lg-offset-2 text-center">
                  <i class="fa fa-phone fa-3x wow bounceIn"></i>
                  <p>(51) 3577-4871</p>
               </div>
               <div class="col-lg-4 text-center">
                  <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                  <p><a href="mailto:your-email@your-domain.com">chegola@gmail.com</a></p>
               </div>
            </div>
         </div>
      </section>
      <!-- jQuery -->
      <script src="js/jquery.js"></script>
      <!-- Bootstrap Core JavaScript -->
      <script src="js/bootstrap.min.js"></script>
      <!-- Plugin JavaScript -->
      <script src="js/jquery.easing.min.js"></script>
      <script src="js/jquery.fittext.js"></script>
      <script src="js/wow.min.js"></script>
      <!-- Custom Theme JavaScript -->
      <script type="text/javascript">
         $('#exampleModal').on('show.bs.modal', function (event) {
           var button = $(event.relatedTarget) // Button that triggered the modal
           var recipient = button.data('whatever') // Extract info from data-* attributes
           // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
           // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
           var modal = $(this)
           modal.find('.modal-title').text('New message to ' + recipient)
           modal.find('.modal-body input').val(recipient)
         })
         
      </script>
      <script src="js/creative.js"></script>
      <script>
         (function () {
         var video = document.getElementById('video');
         video.addEventListener('canplay', function () {
           video.play();
         });
         }());
         //@ sourceURL=pen.js
      </script>
      <script>
         if (document.location.search.match(/type=embed/gi)) {
           window.parent.postMessage("resize", "*");
         }
      </script>
   </body>
</html>