package me.mchiappinam.pdghvoidspawn;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2iniciando timer...");
		startTimerCheck();
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2timer iniciado...");
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2Acesse: http://pdgh.com.br/");
	}
	    
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHVoidSpawn] §2Acesse: http://pdgh.com.br/");
	}
	    
	public void startTimerCheck() {
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
				for (Player p : getServer().getOnlinePlayers()) {
					if(p.getLocation().getBlockY()<0) {
							
						World w = getServer().getWorld("world");
					    if (w != null) {
					    	p.teleport(w.getSpawnLocation());
					    	p.sendMessage("§cVai não...");
					    }else{
					    	p.sendMessage("§cOcorreu um erro. Notifique alguém da STAFF.");
					    }
					
					}
				}
			}
		}, 0, 20);
	}
	  
}