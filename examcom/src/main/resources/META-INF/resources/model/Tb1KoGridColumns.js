/**
 * 子グリッド定義
 */

let Tb1KoGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1KoGrid.sosenId'], 80, 'primaryKey numbering', 'SOSEN_MEI'),
    Column.comma('OYA_BN', Messages['Tb1KoGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1KoGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1KoGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.text('KO_MEI', Messages['Tb1KoGrid.koMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1KoGrid.deleteF'], 30, ''),
];
