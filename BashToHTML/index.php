<?php
	function acedGetInfo(){
		$output = shell_exec('aced-cli getinfo');
		echo "<div class='output'>$output</div>";
	}
	function acedMasternodeStatus(){
		$output = shell_exec('aced-cli masternode status');
		echo "<div class='output'>$output</div>";
	}
	
	function acedgetBlockCount(){
		$output = shell_exec('aced-cli getblockcount');
		echo "<div class='output'>$output</div>";
	}
?>