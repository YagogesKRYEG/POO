package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame {
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel ("Nome Categoria:");
	static JLabel lblDescCat = new JLabel ("Descrição:");
			
	static JTextField txtIdCat = new JTextField();		
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
			
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//Elementos para o fornecedor 
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRs = new JLabel("Id Razão Social:");
	static JLabel lblCNPJ = new JLabel("CNPJ:");
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCNPJ = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//Elemmentos para o produtos
	static JLabel lblIdPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel("Nome do Produto:");
	static JLabel lblDescPr = new JLabel("Descrição do Produto:");
	static JLabel lblCategoriaPr = new JLabel("Id Fornecedor:");
	static JLabel lblFornecedorPr = new JLabel("Id Razão Social:");
	static JLabel lblPrecoPr = new JLabel("Preço do Produto:");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoriaPr = new JTextField();
	static JTextField txtFornecedorPr = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");
	
	
	
	public static void main(String[] args) {
		JFrame gerenciar = new JFrame ();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(700,800);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gerenciar.setResizable(false);
		//Definer o gerenciamento do layout como absoluto,ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10 ,10 ,200 ,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10 ,35 ,200 ,30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10 ,75 ,200 ,30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10 ,110 ,200 ,30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10 ,140 ,200 ,30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10 ,175 ,200 ,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10 ,220 ,200 ,30);
		gerenciar.add(btnCadCat);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		lblNomePr.setBounds(200,75,150,30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(200,105,150,30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(200,180,150,65);
		gerenciar.add(lblDescPr);
		
		txtDescPr.setBounds(200,180,415,65);
		gerenciar.add(txtDescPr);
		
		lblCategoriaPr.setBounds(200,245,150,30);
		gerenciar.add(lblCategoriaPr);
		
		txtCategoriaPr.setBounds(200,275,150,30);
		gerenciar.add(txtCategoriaPr);
		
		lblFornecedorPr.setBounds(200,310,150,30);
		gerenciar.add(lblFornecedorPr);
		
		txtFornecedorPr.setBounds(200,345,150,30);
		gerenciar.add(txtFornecedorPr);
		
		lblPrecoPr.setBounds(200,375,100,30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(200, 410,150 ,30);
		gerenciar.add(txtPrecoPr);
	
		btnCadPr.setBounds(220, 460, 150, 30);
		gerenciar.add(btnCadPr);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		lblRs.setBounds(10,245,150,30);
		gerenciar.add(lblRs);
		
		txtRS.setBounds(10,275,100,30);
		gerenciar.add(txtRS);
		
		lblCNPJ.setBounds(10,375,100,30);
		gerenciar.add(lblCNPJ);
		
		txtCNPJ.setBounds(10,410,100,30);
		gerenciar.add(txtCNPJ);
	
		btnCadFor.setBounds(10,445,180,30);
		gerenciar.add(btnCadFor);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//######################### desabilitar os controles textfield do
				//######################### fornecedor e produtos
				//#########################
				txtIdFor.setEnabled(false);
				txtRS.setEditable(false);
				txtCNPJ.setEnabled(false); 
				btnCadFor.setEnabled(false);
				
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedorPr.setEnabled(false);
				txtCategoriaPr.setEnabled(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				
				//-----------Vamos criar o objeto categoria e passar os dados do formulário para o objeto criado.
				Categoria cat = new Categoria();
				
				//-----------Vamos fazer a passagem dos dados para o objeto no momento em que clicarmos no botão de cadastro
				btnCadCat.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cat.setId(Integer.parseInt(txtIdCat.getText()));
						cat.setNome(txtNomeCat.getText());
						cat.setDescricao(txtDescCat.getText());
						
				//------------------Desabilitar as caixas de categoria
						txtIdCat.setEnabled(false);
						txtNomeCat.setEnabled(false);
						txtDescCat.setEnabled(false);
						btnCadCat.setEnabled(false);
						
				//------------------Desabilitar as caixas de categoria
						txtIdFor.setEnabled(true);
						txtRS.setEnabled(true);
						txtCNPJ.setEnabled(true);
						btnCadFor.setEnabled(true);
					}
				});
				//------- Vamos instanciar a classe fornecedor e passaros dados paa objeto no momento 
				//------- em que o botão de cadastro for clicado
				Fornecedor f = new Fornecedor();
				
				btnCadFor.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						f.setId(Integer.parseInt(txtIdFor.getText()));
						f.setRazaoSocial(txtRS.getText());
						f.setCnpj(txtCNPJ.getText());
						
						//-------------desabilitar as caixas do fornecedor 
						txtIdFor.setEnabled(false);
						txtRS.setEditable(false);
						txtCNPJ.setEnabled(false); 
						btnCadFor.setEnabled(false);
						
						//-------------habilitar os controles produto
						txtIdPr.setEnabled(false);
						txtNomePr.setEnabled(false);
						txtDescPr.setEnabled(false);
						txtFornecedorPr.setEnabled(false);
						txtCategoriaPr.setEnabled(false);
						txtPrecoPr.setEnabled(false);
						btnCadPr.setEnabled(false);
						
						
						
					}
				});
				
				//----Vamos Criar um objeto baseado em produtos para passar os dados no momento do clique 
				//---- botão Cadastro
				Produto pr = new Produto(); 
				btnCadPr.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						pr.setId(Integer.parseInt(txtIdPr.getText()));
						pr.setName(txtNomePr.getText());
						pr.setDescricao(txtDescPr.getText());
						pr.setCategoria(cat);
						pr.setFornecedor(f);
						pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
						
						
						//-------------habilitar os controles produto
						txtIdPr.setEnabled(false);
						txtNomePr.setEnabled(false);
						txtDescPr.setEnabled(false);
						txtFornecedorPr.setEnabled(false);
						txtCategoriaPr.setEnabled(false);
						txtPrecoPr.setEnabled(false);
						btnCadPr.setEnabled(false);
						//----Caixa de Confirmação
						JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
						
						//----Habilitar Categorias
						txtIdFor.setEnabled(true);
						txtRS.setEditable(true);
						txtCNPJ.setEnabled(true); 
						btnCadFor.setEnabled(true);
					}
				});
		
		gerenciar.setVisible(true);
	}

}
