<?php

	$login = isset($_GET['login']) ? $_GET['login'] : '';
	$senha = isset($_GET['senha']) ? $_GET['senha'] : '';

	$login_valido = !$login == '';
	$senha_valida = !$senha == '';

	$conexao = new mysqli("localhost", "u533776325_app", "senhaVirtualFit(14)", "u533776325_vifit");

	if($conexao->connect_errno){
		echo json_encode(array('ERROR_CODE' => 101, 'ERROR_MESSAGE' => 'Banco de dados fora do ar'));
		exit();
	}

	if($login_valido && $senha_valida){
		
		$sql = "SELECT * FROM tbAlunos WHERE login = '$login' AND senha = '$senha'";

		$result = $conexao->query($sql);
		$usuario = array();
		if($row = $result->fetch_assoc()){
			$idUsuario = $row['id'];
			array_push($usuario, $row);

			$sqlExercicios = "SELECT * FROM tbExercicios WHERE id_aluno = $idUsuario";
			$result_exercicios = $conexao->query($sqlExercicios);
			$exercicios = array();
			while($linha = $result_exercicios->fetch_assoc()){
				array_push($exercicios, $linha);
			}
			$usuario['lista_exercicios'] = $exercicios;

			echo json_encode($usuario);

		} else{
			echo json_encode(array('ERROR_CODE' => 102, 'ERROR_MESSAGE' => 'Usuario ou senha inválidos'));
			exit();	
		}

	} else{
		echo json_encode(array('ERROR_CODE' => 100, 'ERROR_MESSAGE' => 'Usuario ou senha nulos'));
		exit();
	}