/**
 * エンティティ１グリッド定義
 */

let Tb1Entity1GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity1Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity1Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity1Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY1_MEI', Messages['Tb1Entity1Grid.entity1Mei'], 300, '', null),
    Column.refer('SANSHO1_ID', Messages['Tb1Entity1Grid.sansho1Id'], 80, '', 'null'),
    Column.text('SANSHO1_MEI', Messages['Tb1Entity1Grid.sansho1Mei'], 300, '', null),
    Column.refer('SANSHO2_CD', Messages['Tb1Entity1Grid.sansho2Cd'], 48, '', 'null'),
    Column.text('SANSHO2_MEI', Messages['Tb1Entity1Grid.sansho2Mei'], 300, '', null),
    Column.refer('SANSHO3_NO', Messages['Tb1Entity1Grid.sansho3No'], 80, '', 'null'),
    Column.text('SANSHO3_MEI', Messages['Tb1Entity1Grid.sansho3Mei'], 300, '', null),
    Column.refer('BETSU_SANSHO1_ID', Messages['Tb1Entity1Grid.betsuSansho1Id'], 80, '', 'null'),
    Column.text('BETSU_SANSHO1_MEI', Messages['Tb1Entity1Grid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1Entity1Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1Entity1Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1Entity1Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1Entity1Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity1Grid.deleteF'], 30, ''),
];
