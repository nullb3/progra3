package examenmontielrua.examen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController

public class ExamenRestController {
    Pedido pedidoList = new Pedido();
    @GetMapping("/pedidos")
    public void getPedidos(){
       
        pedidoList.getPedidos();
    }
    
    @PostMapping("/pedidos")
    public void addPedido(int Precio, int Cantidad, String Descripcion) {
        Pedido pedido = new Pedido(Precio,Cantidad,Descripcion);
        pedidoList.addPedido(pedido);
        pedidoList.getPedidos();
        pedidoList.getTotal();
    }

    @DeleteMapping("/pedidos")
    public void removePedido(int index) {
        pedidoList.getPedidos();
        pedidoList.removePedido(index);
        pedidoList.getPedidos();
        
    }

    @PutMapping("/pedidos")
    public void editPedido(int Precio, int Cantidad, String Descripcion, int index) {
        Pedido pedido = new Pedido(Precio,Cantidad,Descripcion);
        pedidoList.updateListMember(pedido,index);
        pedidoList.getPedidos();
    }

}
