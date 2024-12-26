/**
 * 子孫グリッド定義
 */

let Tb1ShisonGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1ShisonGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.comma('OYA_BN', Messages['Tb1ShisonGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1ShisonGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1ShisonGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.comma('SHISON_BN', Messages['Tb1ShisonGrid.shisonBn'], 80, 'primaryKey numbering', null),
    Column.text('SHISON_MEI', Messages['Tb1ShisonGrid.shisonMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1ShisonGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1ShisonGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
